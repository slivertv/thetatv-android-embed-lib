# Theta.tv Android Embed Library 


## Prerequisites

* Android minimum SDK version : 23 or above


## Importing the library

Import the theta-embed-sdk.aar file into your project

Add the imported library to your app project gradle file

Add the following library to your gradle file :

```
implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
```

## Getting an OAuth Token for your user

To be able to use the Embed SDK, you need to authenticate your users with the Theta.tv auth system.
The following backend request will give you a user id and a user token that needs to be passed to the Android Embed SDK.
You'll need a Client Id and a Client Secret to do this authentication. 
Warning: the Client Secret should never be accessible client side, you'll have to do the request using your own backend.

```
POST Authenticate user
https://api.theta.tv/v1/oauth2

Query Params:
client_id - required
client_secret - required

Payload:
sns_id - required - unique identifier for your user
auth_type = "app"
username - required
```

This request will return a User object, you'll only need to get 2 attributes from it : id and access_token, respectively used as userId and userToken in the Embed SDK.


## Using the library



The Theta.tv embed is wrapped into a Fragment, here is how to create it:

```
EmbedFragment.newInstance(
    userId = "USER_ID", //mandatory
    userToken = "USER_TOKEN", //mandatory
)
```

userId and userToken are respectively the attributes id and access_token you've gotten from the auth query.