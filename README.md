# Parcel Organizer Android

Parcel Organizer Native Android application

## Features

- Light/dark mode.
- Login and Register.
- Password recovery.
- Update account details.
- Persist, update or delete parcels.
- Search, order or filter the parcels.

## Tech used

- Kotlin.
- MVVM Architecture using Architecture Components.
- Single Activity with navigation between fragments using Navigation Components.
- Material design using Material Components.
- Api calls using Retrofit and RxJava.

## Screenshots


![Login screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_login.png?raw=true) 
![Register screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_register.png?raw=true)

![Parcels screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_parcels.png?raw=true) 
![Empty state screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_parcels_empty.png?raw=true)

![Sort screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_sorts.png?raw=true) 
![Sort by screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_sort_by.png?raw=true)

![Create parcel screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_create_parcel.png?raw=true) 
![Update parcel screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_update_parcel.png?raw=true)

![Profile screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_account.png?raw=true) 
![Profile dark screenshot](https://github.com/kmartin0/assets/blob/master/parcel-organizer-android/parcel_organizer_android_account_dark.png?raw=true)



## How to get it running

1. Upgrade gradle to 7.2
2. Set `client.secret.username="parcel-organizer-android"` and `client.secret.password="secret"` in your local properties
3. Start the postgres server and parcel-organizer-api and add the IP:port as a baseUrl in `ParcelTrackerApi.kt`
4. If required, change the `network_security_config.xml` settings to include Subdomains of the api IP
5. Profit!
