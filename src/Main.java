void main() {
    Note note1 = new Note();
    int[] Noten = new int[]{29, 37, 38, 41, 84, 67};

    System.out.println("Schlechte Noten :");
    int[] Snoten = note1.SchlechteNote(Noten);
    for (int i = 0; i < Snoten.length; i++) {
        System.out.print(Snoten[i] + " ");
    }
    System.out.println();

    System.out.println("Durchschnitt : " + note1.Durchschnitt(Noten));

    System.out.println("Aufgerundete Noten: ");
    int[] AufgerundeteNoten = note1.AufrundeNote(Noten);
    for (int i = 0; i < AufgerundeteNoten.length; i++) {
        System.out.print(AufgerundeteNoten[i] + " ");
    }
    System.out.println();

    System.out.println("Max Aufgerundete Note : " + note1.MaxAufgerundeNote(Noten));
}
