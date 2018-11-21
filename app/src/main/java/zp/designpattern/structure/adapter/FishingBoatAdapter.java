package zp.designpattern.structure.adapter;

/**
 * Created by change on 2018/11/20.
 */

public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
