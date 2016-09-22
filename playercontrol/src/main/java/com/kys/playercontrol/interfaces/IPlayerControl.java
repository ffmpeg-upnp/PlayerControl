/*****************************************************************************
 * IPlayerControl.java
 *****************************************************************************
 * Copyright © 2011-2012 VLC authors and VideoLAN
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 *****************************************************************************/
package com.kys.playercontrol.interfaces;

public interface IPlayerControl {
    void setState(boolean isPlaying);

    void setSeekable(boolean isSeekable);

    void onSeekTo(int position);

    void setVideoLength(int length);

    void setCurrentPosition(int position);

    void setTouchCurrentPosition(int position);

    void setOnPlayerControlListener(OnPlayerControlListener listener);

    void setSmallVolBri(boolean show);

    void setFullVolBri(boolean show);

    void setDlnaRefresh(boolean show);

    void setTitle(String title);

    void setDefinition(String string);

    void setBookMark(int position);

    void setFavoriteShow(boolean show);

    void setDlnaShow(boolean show);

    void setShareShow(boolean show);
}