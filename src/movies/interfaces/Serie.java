package movies.interfaces;

/**
 * Created by carlos on 20/05/17.
 */
/**
 * This interface is for Series
 * In this case I use this interace to manage all kind of Series
 * This interface is inherited from Movies because it has all the
 * characteristics to be considered like that
 */
public interface Serie extends Movie {
    /**
     * set number of episodes of a serie
     * @param numberOfEpisodes
     */
    void setNumberOfEpisodes(int numberOfEpisodes);
    /**
     * set number of Seasons of a serie
     * @param numberOfSeasons
     */
    void setNumberOfSeasons(int numberOfSeasons);
    /**
     * get number of episodes
     * @return numberOfEpisodes attribute
     */
    int getNumberOfEpisodes();

    /**
     * get number of episodes
     * @return numberOfSeasons attribute
     */
    int getNumberOfSeasons();
}