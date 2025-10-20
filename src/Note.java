public class Note {
    private int note;

    public int getNote(){
        return note;
    }

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

    public int [] AufrundeNote(int [] Noten) {
        int [] aufrundeNoten = new int[Noten.length];
        for (int i = 0; i < Noten.length; i++) {
            int x = Noten[i] / 5;
            if (Noten[i] >= 38) {
                x = x+1;
                x = x * 5;
                if (x - Noten[i] < 3) {
                    aufrundeNoten[i] = x;
                }
            }
        }
        return aufrundeNoten;
    }

    public  int MaxAufgerundeNote(int [] Noten){
        int max = 0;
        for (int i = 0; i < Noten.length; i++) {
            if (Noten[i] > max) {
                max = Noten[i];
            }
        }
        return max;
    }
}
