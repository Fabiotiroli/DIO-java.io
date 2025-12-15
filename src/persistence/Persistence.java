package persistence;

public interface Persistence {


    String write(final String data);

    String read(final String data);

    boolean remove(final String sentence);

    String replace(final String oldContent, final String newContent);

    String findAll(final String pattern);

    String findBy(final String sentence);
}
