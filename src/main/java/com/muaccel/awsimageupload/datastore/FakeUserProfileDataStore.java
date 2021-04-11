package com.muaccel.awsimageupload.datastore;

import com.muaccel.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(
                new UserProfile(
                        UUID.fromString("408956be-fe73-4296-ab3a-3ab53e257922"),
                        "janetjones",
                        null
                        )
        );

        USER_PROFILES.add(
                new UserProfile(
                        UUID.fromString("f68fb294-ef1a-4f98-902e-b540fd18d8c9"),
                        "antoniojunior",
                        null
                )
        );
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
