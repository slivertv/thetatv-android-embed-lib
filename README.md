# Theta.tv Android Embed Library 


## Prerequisites

* Android minimum SDK version : 23 or above


## Importing the library

Import the theta-embed-sdk.aar file into your project

Add the imported library to your app project gradle file

Add the following libraries to your gradle file :

```
implementation 'com.squareup.okhttp3:okhttp:4.7.2'
implementation 'com.google.code.gson:gson:2.8.6'
implementation 'com.squareup.retrofit2:retrofit:2.6.2'
implementation 'com.squareup.retrofit2:converter-gson:2.6.2'
implementation 'com.squareup.retrofit2:adapter-rxjava2:2.3.0'
implementation 'io.reactivex.rxjava2:rxjava:2.2.9'
implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
```

## Using the library

The Theta.tv embed is wrapped into a Fragment, here is how to create it:

```
EmbedFragment.newInstance(
    partnerId = "YOUR_PARTNER_ID", //mandatory
    partnerSecret = "YOUR_PARTNER_SECRET", //mandatory
    currentUserId = "CURRENT_USER_ID", //mandatory
    currentUsername = "CURRENT_USERNAME" //optionnal
)
```

* partnerId and partnerSecret are unique to your application and provided by Theta Labs
* currentUserId and currentUsername are the identifients of the user logged into your app
