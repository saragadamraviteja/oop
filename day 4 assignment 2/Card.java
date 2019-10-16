public class Card  {
    private String title;
    private String author;
    private String subject;

    public Card(String title, String author, String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }
    // setTitle
    public void setTitle(final String title1) {
        this.title = title1;
    }
    // getTitle
    public String getTitle() {
        return title;
    }
    // setAuthor
    public void setAuthor(final String author1) {
        this.author = author1;
    }
    // getAuthor
    public String getAuthor() {
        return author;
    }
    // setSubject
    public void setSubject(final String subject1) {
        this.subject = subject1;
    }
    // getSubject
    public String getSubject() {
        return subject;
    }

    }