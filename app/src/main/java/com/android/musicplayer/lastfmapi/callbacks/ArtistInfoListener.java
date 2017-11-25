
package com.android.musicplayer.lastfmapi.callbacks;

import com.android.musicplayer.lastfmapi.models.LastfmArtist;

public interface ArtistInfoListener {

    void artistInfoSucess(LastfmArtist artist);

    void artistInfoFailed();

}
