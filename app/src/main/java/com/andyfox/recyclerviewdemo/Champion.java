package com.andyfox.recyclerviewdemo;

public class Champion {

    private int id;
    private String name;

    public Champion(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * I'm not about to do every champion, just some of them,
     * so technically this function isn't finished
     */
    public int getImageResource() {
        switch (id) {
            case 0: return R.drawable.aatrox_square_0;
            case 1: return R.drawable.ahri_square_0;
            case 2: return R.drawable.akali_square_0;
            case 3: return R.drawable.alistar_square_0;
            case 4: return R.drawable.amumu_square_0;
            case 5: return R.drawable.anivia_square_0;
            case 6: return R.drawable.annie_square_0;
            case 7: return R.drawable.ashe_square_0;
            case 8: return R.drawable.azir_square_0;
            case 9: return R.drawable.bard_square_0;
            case 10: return R.drawable.blitzcrank_square_0;
            case 11: return R.drawable.brand_square_0;
            case 12: return R.drawable.braum_square_0;
            case 13: return R.drawable.caitlyn_square_0;
            case 14: return R.drawable.cassiopeia_square_0;
            case 15: return R.drawable.chogath_square_0;
            case 16: return R.drawable.corki_square_0;
            case 17: return R.drawable.darius_square_0;
            case 18: return R.drawable.diana_square_0;
            case 19: return R.drawable.draven_square_0;
            case 20: return R.drawable.drmundo_square_0;
            default:
                return R.drawable.fizz_square_0;
        }
    }

}
