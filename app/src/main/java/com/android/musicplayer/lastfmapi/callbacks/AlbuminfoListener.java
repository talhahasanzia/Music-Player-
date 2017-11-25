

package com.android.musicplayer.lastfmapi.callbacks;

import com.android.musicplayer.lastfmapi.models.LastfmAlbum;

public interface AlbuminfoListener {

    void albumInfoSucess(LastfmAlbum album);

    void albumInfoFailed();

}
