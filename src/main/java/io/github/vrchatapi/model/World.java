/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.ReleaseStatus;
import io.github.vrchatapi.model.UnityPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * World
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class World {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_URL_OBJECT = "assetUrlObject";
  @SerializedName(SERIALIZED_NAME_ASSET_URL_OBJECT)
  private Object assetUrlObject;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private Integer favorites = 0;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured = false;

  public static final String SERIALIZED_NAME_HEAT = "heat";
  @SerializedName(SERIALIZED_NAME_HEAT)
  private Integer heat = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<List<Object>> instances = null;

  public static final String SERIALIZED_NAME_LABS_PUBLICATION_DATE = "labsPublicationDate";
  @SerializedName(SERIALIZED_NAME_LABS_PUBLICATION_DATE)
  private String labsPublicationDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OCCUPANTS = "occupants";
  @SerializedName(SERIALIZED_NAME_OCCUPANTS)
  private Integer occupants = 0;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization = "vrchat";

  public static final String SERIALIZED_NAME_PLUGIN_URL_OBJECT = "pluginUrlObject";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL_OBJECT)
  private Object pluginUrlObject;

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private Integer popularity = 0;

  public static final String SERIALIZED_NAME_PREVIEW_YOUTUBE_ID = "previewYoutubeId";
  @SerializedName(SERIALIZED_NAME_PREVIEW_YOUTUBE_ID)
  private String previewYoutubeId;

  public static final String SERIALIZED_NAME_PRIVATE_OCCUPANTS = "privateOccupants";
  @SerializedName(SERIALIZED_NAME_PRIVATE_OCCUPANTS)
  private Integer privateOccupants = 0;

  public static final String SERIALIZED_NAME_PUBLIC_OCCUPANTS = "publicOccupants";
  @SerializedName(SERIALIZED_NAME_PUBLIC_OCCUPANTS)
  private Integer publicOccupants = 0;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PRIVATE;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT = "unityPackageUrlObject";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL_OBJECT)
  private Object unityPackageUrlObject;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private List<UnityPackage> unityPackages = new ArrayList<UnityPackage>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version = 0;

  public static final String SERIALIZED_NAME_VISITS = "visits";
  @SerializedName(SERIALIZED_NAME_VISITS)
  private Integer visits = 0;


  public World assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Get assetUrl
   * @return assetUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public World assetUrlObject(Object assetUrlObject) {
    
    this.assetUrlObject = assetUrlObject;
    return this;
  }

   /**
   * Get assetUrlObject
   * @return assetUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getAssetUrlObject() {
    return assetUrlObject;
  }


  public void setAssetUrlObject(Object assetUrlObject) {
    this.assetUrlObject = assetUrlObject;
  }


  public World authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public World authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public World capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * minimum: 0
   * maximum: 40
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public World createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public World description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public World favorites(Integer favorites) {
    
    this.favorites = favorites;
    return this;
  }

   /**
   * Get favorites
   * minimum: 0
   * @return favorites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12024", value = "")

  public Integer getFavorites() {
    return favorites;
  }


  public void setFavorites(Integer favorites) {
    this.favorites = favorites;
  }


  public World featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  public World heat(Integer heat) {
    
    this.heat = heat;
    return this;
  }

   /**
   * Get heat
   * minimum: 0
   * @return heat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public Integer getHeat() {
    return heat;
  }


  public void setHeat(Integer heat) {
    this.heat = heat;
  }


  public World id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public World imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public World instances(List<List<Object>> instances) {
    
    this.instances = instances;
    return this;
  }

  public World addInstancesItem(List<Object> instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<List<Object>>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<Object>> getInstances() {
    return instances;
  }


  public void setInstances(List<List<Object>> instances) {
    this.instances = instances;
  }


  public World labsPublicationDate(String labsPublicationDate) {
    
    this.labsPublicationDate = labsPublicationDate;
    return this;
  }

   /**
   * Get labsPublicationDate
   * @return labsPublicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getLabsPublicationDate() {
    return labsPublicationDate;
  }


  public void setLabsPublicationDate(String labsPublicationDate) {
    this.labsPublicationDate = labsPublicationDate;
  }


  public World name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public World namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public World occupants(Integer occupants) {
    
    this.occupants = occupants;
    return this;
  }

   /**
   * Get occupants
   * minimum: 0
   * @return occupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "47", value = "")

  public Integer getOccupants() {
    return occupants;
  }


  public void setOccupants(Integer occupants) {
    this.occupants = occupants;
  }


  public World organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public World pluginUrlObject(Object pluginUrlObject) {
    
    this.pluginUrlObject = pluginUrlObject;
    return this;
  }

   /**
   * Get pluginUrlObject
   * @return pluginUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getPluginUrlObject() {
    return pluginUrlObject;
  }


  public void setPluginUrlObject(Object pluginUrlObject) {
    this.pluginUrlObject = pluginUrlObject;
  }


  public World popularity(Integer popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * minimum: 0
   * @return popularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getPopularity() {
    return popularity;
  }


  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  public World previewYoutubeId(String previewYoutubeId) {
    
    this.previewYoutubeId = previewYoutubeId;
    return this;
  }

   /**
   * Get previewYoutubeId
   * @return previewYoutubeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviewYoutubeId() {
    return previewYoutubeId;
  }


  public void setPreviewYoutubeId(String previewYoutubeId) {
    this.previewYoutubeId = previewYoutubeId;
  }


  public World privateOccupants(Integer privateOccupants) {
    
    this.privateOccupants = privateOccupants;
    return this;
  }

   /**
   * Get privateOccupants
   * minimum: 0
   * @return privateOccupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getPrivateOccupants() {
    return privateOccupants;
  }


  public void setPrivateOccupants(Integer privateOccupants) {
    this.privateOccupants = privateOccupants;
  }


  public World publicOccupants(Integer publicOccupants) {
    
    this.publicOccupants = publicOccupants;
    return this;
  }

   /**
   * Get publicOccupants
   * minimum: 0
   * @return publicOccupants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46", value = "")

  public Integer getPublicOccupants() {
    return publicOccupants;
  }


  public void setPublicOccupants(Integer publicOccupants) {
    this.publicOccupants = publicOccupants;
  }


  public World publicationDate(String publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }


  public World releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public World tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public World addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public World thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public World unityPackageUrlObject(Object unityPackageUrlObject) {
    
    this.unityPackageUrlObject = unityPackageUrlObject;
    return this;
  }

   /**
   * Get unityPackageUrlObject
   * @return unityPackageUrlObject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getUnityPackageUrlObject() {
    return unityPackageUrlObject;
  }


  public void setUnityPackageUrlObject(Object unityPackageUrlObject) {
    this.unityPackageUrlObject = unityPackageUrlObject;
  }


  public World unityPackages(List<UnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public World addUnityPackagesItem(UnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   * Get unityPackages
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<UnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(List<UnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public World updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public World version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 0
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "68", required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public World visits(Integer visits) {
    
    this.visits = visits;
    return this;
  }

   /**
   * Get visits
   * minimum: 0
   * @return visits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9988675", required = true, value = "")

  public Integer getVisits() {
    return visits;
  }


  public void setVisits(Integer visits) {
    this.visits = visits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    World world = (World) o;
    return Objects.equals(this.assetUrl, world.assetUrl) &&
        Objects.equals(this.assetUrlObject, world.assetUrlObject) &&
        Objects.equals(this.authorId, world.authorId) &&
        Objects.equals(this.authorName, world.authorName) &&
        Objects.equals(this.capacity, world.capacity) &&
        Objects.equals(this.createdAt, world.createdAt) &&
        Objects.equals(this.description, world.description) &&
        Objects.equals(this.favorites, world.favorites) &&
        Objects.equals(this.featured, world.featured) &&
        Objects.equals(this.heat, world.heat) &&
        Objects.equals(this.id, world.id) &&
        Objects.equals(this.imageUrl, world.imageUrl) &&
        Objects.equals(this.instances, world.instances) &&
        Objects.equals(this.labsPublicationDate, world.labsPublicationDate) &&
        Objects.equals(this.name, world.name) &&
        Objects.equals(this.namespace, world.namespace) &&
        Objects.equals(this.occupants, world.occupants) &&
        Objects.equals(this.organization, world.organization) &&
        Objects.equals(this.pluginUrlObject, world.pluginUrlObject) &&
        Objects.equals(this.popularity, world.popularity) &&
        Objects.equals(this.previewYoutubeId, world.previewYoutubeId) &&
        Objects.equals(this.privateOccupants, world.privateOccupants) &&
        Objects.equals(this.publicOccupants, world.publicOccupants) &&
        Objects.equals(this.publicationDate, world.publicationDate) &&
        Objects.equals(this.releaseStatus, world.releaseStatus) &&
        Objects.equals(this.tags, world.tags) &&
        Objects.equals(this.thumbnailImageUrl, world.thumbnailImageUrl) &&
        Objects.equals(this.unityPackageUrlObject, world.unityPackageUrlObject) &&
        Objects.equals(this.unityPackages, world.unityPackages) &&
        Objects.equals(this.updatedAt, world.updatedAt) &&
        Objects.equals(this.version, world.version) &&
        Objects.equals(this.visits, world.visits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetUrlObject, authorId, authorName, capacity, createdAt, description, favorites, featured, heat, id, imageUrl, instances, labsPublicationDate, name, namespace, occupants, organization, pluginUrlObject, popularity, previewYoutubeId, privateOccupants, publicOccupants, publicationDate, releaseStatus, tags, thumbnailImageUrl, unityPackageUrlObject, unityPackages, updatedAt, version, visits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class World {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetUrlObject: ").append(toIndentedString(assetUrlObject)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    heat: ").append(toIndentedString(heat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    labsPublicationDate: ").append(toIndentedString(labsPublicationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pluginUrlObject: ").append(toIndentedString(pluginUrlObject)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    previewYoutubeId: ").append(toIndentedString(previewYoutubeId)).append("\n");
    sb.append("    privateOccupants: ").append(toIndentedString(privateOccupants)).append("\n");
    sb.append("    publicOccupants: ").append(toIndentedString(publicOccupants)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    unityPackageUrlObject: ").append(toIndentedString(unityPackageUrlObject)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

