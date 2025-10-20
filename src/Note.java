public class Note {
    private int note;

    public int [] SchlechteNote(int [] Noten) {
        int count = 0;
        for (int i = 0; i < Noten.length; i++) {
            if (Noten[i] < 40) {
                count++;
            }
        }

        int[] schlechteNoten = new int[count];
        int index = 0;
        for (int i = 0; i < Noten.length; i++) {
            if (Noten[i] < 40) {
                schlechteNoten[index] = Noten[i];
                index++;
            }
        }
        return schlechteNoten;

    }

    public int Durchschnitt(int [] Noten) {
        int sum = 0;
        for (int i = 0; i < Noten.length; i++) {
            sum += Noten[i];
        }
        return sum / Noten.length;
    }
}
