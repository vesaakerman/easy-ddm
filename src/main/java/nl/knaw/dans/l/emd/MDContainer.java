package nl.knaw.dans.l.emd;

/**
 * Semantic metaphor for metadata containers.
 *
 * @author ecco
 */
public enum MDContainer
{
    // ecco: CHECKSTYLE: OFF
    Title(true), Creator(true), Subject(true), Description(true), Publisher(true), Contributor(true), Date(true), Type(true), Format(true), Identifier(true), Relation(
            true), Source(true), Language(true), Coverage(true), Rights(true), Audience(false), Other(false);

    /**
     * Is this metadata container part of the 15 legacy /elements/1.1/ of the DCMI-terms, also known as 'simple dublin core'.
     */
    public final boolean isDC;

    private MDContainer(final boolean isDC)
    {
        this.isDC = isDC;
    }
    // ecco: CHECKSTYLE: ON
}
