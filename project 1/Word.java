public class Word {
    /**
     * string to store the name of the movie.
     */
    private String word;
    /**
     * string to store the 1st hint of the movie.
     */
    private String hint1;
    /**
     * string to store the 2nd hint of the movie.
     */
    private String hint2;
    /**
     * string to store the level of the movie.
     */
    private String level;

    /**
     * Assigning movie name, level, hints to the object.
     * @param word1 name of the movie from text file.
     * @param level1 level of the movie from text file.
     * @param hint11 hint1 of the movie from text file.
     * @param hint21 hint2 of the movie from text file.
     */


    public Word(final String word1, final String level1,
    final String hint11, final String hint21) {


        this.word = word1;
        this.level = level1;
        this.hint1 = hint11;
        this.hint2 = hint21;
    }

    /**
     * function to get the name of the movie.
     * @return the name of the movie.
     */
    public String getWord() {
        return this.word;
    }
    /**
     * function to get the level of the movie.
     * @return the level of the movie.
     */
    public String getLevel() {
        return this.level;
    }
    /**
     * function to get the hint1 of the movie.
     * @return the hint1 of the movie.
     */
    public String getHint1() {
        return this.hint1;
    }
    /**
     * function to get the hint2 of the movie.
     * @return the hint2 of the movie.
     */
    public String getHint2() {
        return this.hint2;
    }

}
