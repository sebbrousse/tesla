package org.apache.maven.extension;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.metadata.ArtifactMetadataRetrievalException;
import org.apache.maven.artifact.resolver.ArtifactNotFoundException;
import org.apache.maven.artifact.resolver.ArtifactResolutionException;
import org.codehaus.plexus.PlexusContainerException;
import org.codehaus.plexus.classworlds.realm.DuplicateRealmException;
import org.codehaus.plexus.classworlds.realm.NoSuchRealmException;
import org.codehaus.plexus.component.repository.exception.ComponentRepositoryException;
import org.codehaus.plexus.configuration.PlexusConfigurationException;

import java.net.MalformedURLException;

public class ExtensionManagerException
    extends Exception
{

    private Artifact extensionArtifact;
    private final String projectId;

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      ArtifactMetadataRetrievalException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      DuplicateRealmException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      ArtifactResolutionException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      ArtifactNotFoundException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      MalformedURLException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      PlexusConfigurationException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      String projectId,
                                      DuplicateRealmException cause )
    {
        super( message, cause );
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      NoSuchRealmException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      String projectId,
                                      PlexusContainerException cause )
    {
        super( message, cause );
        this.projectId = projectId;
    }

    public ExtensionManagerException( String message,
                                      Artifact extensionArtifact,
                                      String projectId,
                                      ComponentRepositoryException cause )
    {
        super( message, cause );
        this.extensionArtifact = extensionArtifact;
        this.projectId = projectId;
    }

    public Artifact getExtensionArtifact()
    {
        return extensionArtifact;
    }

    public String getProjectId()
    {
        return projectId;
    }

}