package com.example.shop.model;

import com.example.shop.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Profile {

    public int ProfileImage;
    public String ProfileName;

    public Profile(int profileImage, String profileName) {
        ProfileImage = profileImage;
        ProfileName = profileName;
    }

    public static final ArrayList<Profile> PROFILES= new ArrayList<>(Arrays.asList(
            new Profile(R.drawable.img_profile, "@user_1"),
            new Profile(R.drawable.img_profile, "@user_2"),
            new Profile(R.drawable.img_profile, "@user_3"),
            new Profile(R.drawable.img_profile, "@user_4"),
            new Profile(R.drawable.img_profile, "@user_5"),
            new Profile(R.drawable.img_profile, "@user_6"),
            new Profile(R.drawable.img_profile, "@user_7")
            ));
}
