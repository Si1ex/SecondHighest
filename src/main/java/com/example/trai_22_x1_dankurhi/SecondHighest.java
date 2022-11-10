


public class TRAI_22_X1_dankurhi implements TRAI_22_X1 {
    public Integer toiseksiSuurin(Integer[] A) {

        int suurin = 0;
        int toiseksiSuurin = 0;

        if (A.length < 2) {
            return null;
        }
        for (Integer x : A) {
            if (x > suurin) {
                toiseksiSuurin = suurin;
                suurin = x;
            } else if (x > toiseksiSuurin && x != suurin) {
                toiseksiSuurin = x;
            }
        }
        if (toiseksiSuurin == 0) {
            return null;
        }
        return toiseksiSuurin;
    }
}
