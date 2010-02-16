package com.mjs_svc.lywriter.api;

/**
 *
 * @author MatthewScott
 * @version $Id: ChoirStaff.java 4 2010-02-02 23:14:49Z mjs@mjs-svc.com $
 */
public class ChoirStaff extends StaffGroup {
    Staff soprano, alto, tenor, bass;
    Lyrics sopranoLyrics, altoLyrics, tenorLyrics, bassLyrics;

    /**
     *
     */
    public ChoirStaff() {
        super();

        soprano = new Staff(new Instrument().getInstrumentList().get(0));
        soprano.setVarName("sopranoStaff");
        soprano.set(0, new Voice());
        soprano.get(0).setVarName("sopranoVoice");
        sopranoLyrics = new Lyrics(soprano.get(0).getVarName());

        alto = new Staff(new Instrument().getInstrumentList().get(0));
        alto.setVarName("altoStaff");
        alto.set(0, new Voice());
        alto.get(0).setVarName("altoVoice");
        altoLyrics = new Lyrics(alto.get(0).getVarName());

        tenor = new Staff(new Instrument().getInstrumentList().get(0));
        tenor.setVarName("tenorStafff");
        tenor.set(0, new Voice());
        tenor.get(0).setVarName("tenorVoice");
        tenorLyrics = new Lyrics(tenor.get(0).getVarName());

        bass = new Staff(new Instrument().getInstrumentList().get(0));
        bass.setVarName("bassStaff");
        bass.set(0, new Voice());
        bass.get(0).setVarName("bassVoice");
        bassLyrics = new Lyrics(bass.get(0).getVarName());

        staves.add(soprano);
        staves.add(alto);
        staves.add(tenor);
        staves.add(bass);
    }
}
