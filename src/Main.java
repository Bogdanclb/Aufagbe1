void main() {
    Note note1=new Note();
    int [] Noten = new int [] {55,23,67,12,89,34};
    int [] Snoten;
    Snoten = note1.SchlechteNote(Noten);
    for (int i = 0; i < Snoten.length; i++) {
        System.out.println(Snoten[i]);
    }
    System.out.println(note1.Durchschnitt(Noten));
    int [] AufgerundeteNoten;
    AufgerundeteNoten = note1.AufrundeNote(Noten);
    for (int i = 0; i < AufgerundeteNoten.length; i++) {
        System.out.println(AufgerundeteNoten[i]);
    }
    System.out.println(note1.MaxAufgerundeNote(Noten));

}
