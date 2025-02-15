

# CurrentUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedTOSVersion** | **Integer** |  | 
**accountDeletionDate** | **LocalDate** |  |  [optional]
**activeFriends** | **List&lt;String&gt;** |  |  [optional]
**allowAvatarCopying** | **Boolean** |  | 
**bio** | **String** |  | 
**bioLinks** | **List&lt;String&gt;** |  | 
**currentAvatar** | **String** |  | 
**currentAvatarAssetUrl** | **String** |  | 
**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. | 
**dateJoined** | **LocalDate** |  | 
**developerType** | **DeveloperType** |  | 
**displayName** | **String** |  | 
**emailVerified** | **Boolean** |  | 
**fallbackAvatar** | **String** |  |  [optional]
**friendGroupNames** | **List&lt;String&gt;** | Always empty array. | 
**friendKey** | **String** |  | 
**friends** | **List&lt;String&gt;** |  | 
**hasBirthday** | **Boolean** |  | 
**hasEmail** | **Boolean** |  | 
**hasLoggedInFromClient** | **Boolean** |  | 
**hasPendingEmail** | **Boolean** |  | 
**homeLocation** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**isFriend** | **Boolean** |  | 
**lastLogin** | **OffsetDateTime** |  | 
**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**obfuscatedEmail** | **String** |  | 
**obfuscatedPendingEmail** | **String** |  | 
**oculusId** | **String** |  | 
**offlineFriends** | **List&lt;String&gt;** |  |  [optional]
**onlineFriends** | **List&lt;String&gt;** |  |  [optional]
**pastDisplayNames** | [**List&lt;PastDisplayName&gt;**](PastDisplayName.md) |  | 
**profilePicOverride** | **String** |  | 
**state** | **UserState** |  | 
**status** | **UserStatus** |  | 
**statusDescription** | **String** |  | 
**statusFirstTime** | **Boolean** |  | 
**statusHistory** | **List&lt;String&gt;** |  | 
**steamDetails** | **Object** |  | 
**steamId** | **String** |  | 
**tags** | **List&lt;String&gt;** |  | 
**twoFactorAuthEnabled** | **Boolean** |  | 
**unsubscribe** | **Boolean** |  | 
**userIcon** | **String** |  | 
**username** | **String** |  | 



