package com.andyfox.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * This ChampionAdapter has to extend from RecyclerView.Adapter
 * In the <  > you put the specific type of view holder you are going to use
 * In this case, I want to use my custom ChampionViewHolder
 */
public class ChampionAdapter extends RecyclerView.Adapter<ChampionAdapter.ChampionViewHolder> {

    private List<Champion> championList;

    public ChampionAdapter(List<Champion> champions) {
        championList = champions;
    }

    /**
     * This method will be automatically called when the adapter recyclerview decides it needs a new view holder
     * Usually we will use a LayoutInflater to inflate the view, and then create a view holder with that view
     * Once that is done we'll return that view holder.
     * You don't have to worry about when to inflate a new view
     * you just tell it what view you want to inflate here when the recyclerview decides that it needs a new one
     */
    @Override
    public ChampionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // I need a Context to get a layout inflater, which i can get from the ViewGroup parent

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // now I can inflate the view from the XML file I made
        // this is kind of similar to when you call setContentView(R.layout....); but you need to put
        // the ViewGroup parent in the inflate function

        View view = inflater.inflate(R.layout.view_holder_champion, parent, false);
        // now we have the view (which is the list item) we can create the ViewHolder

        ChampionViewHolder championViewHolder = new ChampionViewHolder(view);

        // then we return the view holder we just made
        return championViewHolder;
    }

    /**
     * This function will be called when we want to attach new data to an item in the list
     * this is what I was talking about when the view reaches the top of of the list and goes off screen
     * it gets recycled and will appear at the bottom of the list, but with new information in the views
     * When the view gets recycled and is about to be used again, this is this function that gets called
     * Here we tell the view what we want it to show
     * We can use the position to know what list item we are binding, thus we will get the champion in the
     * championList at that position and use that champions information to use
     */
    @Override
    public void onBindViewHolder(ChampionViewHolder holder, int position) {
        // get the champion at the postion in the list
        Champion champion = championList.get(position);

        holder.imageView.setImageResource(champion.getImageResource());

        holder.textChampionName.setText(champion.getName());
    }

    /**
     * This method MUST return the number of items in the list
     * you can hard code (put a literal number like 0)
     * if you are using a list of items like I do, I will just return that list.size();
     * What this function returns is how the adapter knows if there are more items to keep showing as you scroll
     * So if you are on item 7 and there are 20 items total, it knows there is more data to show and
     * will keep scrolling
     */
    @Override
    public int getItemCount() {
        return championList.size();
    }

    /**
     * This custom view holder I made holds the views for each item in the list
     * It has to extend RecyclerView.ViewHolder
     * In this class, you get access to the views inside each list item
     */
    static class ChampionViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        TextView textChampionName;

        // This itemView is the view we inflated in OnCreateViewHolder to create
        // the ChampionViewHolder. We can use the item view and get access to the
        // views we need to access with findViewById
        public ChampionViewHolder(View itemView) {
            super(itemView);
            imageView        = (ImageView) itemView.findViewById(R.id.image);
            textChampionName = (TextView)  itemView.findViewById(R.id.tv_champion_name);
        }
    }
}
