package com.example.hdwallapers;

import java.util.List;

public class Photos {
    private Boolean success;
    private List<Wallpaper> wallpapers;

    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean value) { this.success = value; }

    public List<Wallpaper> getWallpapers() { return wallpapers; }
    public void setWallpapers(List<Wallpaper> value) { this.wallpapers = value; }
}
