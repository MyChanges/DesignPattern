package zp.designpattern.structure.adapter;

/**
 * Created by change on 2018/11/21.
 */

public class FishingBoatAdapter2 implements RowingBoat {

    FishingBoat2 fishingBoat2;

    public FishingBoatAdapter2() {
        fishingBoat2 = new FishingBoat2();
    }

    @Override
    public void row() {
        fishingBoat2.sail2();
    }
}
