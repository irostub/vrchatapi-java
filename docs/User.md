

# User


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowAvatarCopying** | **Boolean** |  | 
**bio** | **String** |  | 
**bioLinks** | **List&lt;String&gt;** |  | 
**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. | 
**dateJoined** | **LocalDate** |  | 
**developerType** | **DeveloperType** |  | 
**displayName** | **String** | A users visual display name. This is what shows up in-game, and can different from their &#x60;username&#x60;. Changing display name is restricted to a cooldown period. | 
**friendKey** | **String** |  | 
**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**instanceId** | **String** | InstanceID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional]
**isFriend** | **Boolean** | Either their &#x60;friendKey&#x60;, or empty string if you are not friends. Unknown usage. | 
**lastLogin** | **String** | Either a date-time or empty string. | 
**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**location** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional]
**profilePicOverride** | **String** |  | 
**state** | **UserState** |  | 
**status** | **UserStatus** |  | 
**statusDescription** | **String** |  | 
**tags** | **List&lt;String&gt;** |  | 
**userIcon** | **String** |  | 
**username** | **String** | A users unique name, used during login. This is different from &#x60;displayName&#x60; which is what shows up in-game. A users &#x60;username&#x60; can never be changed. | 
**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional]



