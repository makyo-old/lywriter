package com.mjs_svc.lywriter.api;

/**
 *
 * @author MatthewScott
 * @version $Id: GrandStaff.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class GrandStaff extends StaffGroup {
    private Staff rightHand, leftHand;

    /**
     *
     */
    public GrandStaff() {
        super();

        rightHand = new Staff(new Instrument().getInstrumentList().get(0));
        rightHand.set(0, new Voice());
        leftHand = new Staff(new Instrument().getInstrumentList().get(0));
        leftHand.set(0, new Voice());

        staves.add(rightHand);
        staves.add(leftHand);
    }
}
