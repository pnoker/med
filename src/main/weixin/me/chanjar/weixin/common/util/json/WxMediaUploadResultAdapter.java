/*
 * KINGSTAR MEDIA SOLUTIONS Co.,LTD. Copyright c 2005-2013. All rights reserved.
 *
 * This source code is the property of KINGSTAR MEDIA SOLUTIONS LTD. It is intended
 * only for the use of KINGSTAR MEDIA application development. Reengineering, reproduction
 * arose from modification of the original source, or other redistribution of this source
 * is not permitted without written permission of the KINGSTAR MEDIA SOLUTIONS LTD.
 */
package me.chanjar.weixin.common.util.json;

import com.google.gson.*;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;

import java.lang.reflect.Type;

/**
 * 
 * @author Daniel Qian
 *
 */
public class WxMediaUploadResultAdapter implements JsonDeserializer<WxMediaUploadResult> {

  public WxMediaUploadResult deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    WxMediaUploadResult uploadResult = new WxMediaUploadResult();
    JsonObject uploadResultJsonObject = json.getAsJsonObject();

    if (uploadResultJsonObject.get("type") != null && !uploadResultJsonObject.get("type").isJsonNull()) {
      uploadResult.setType(GsonHelper.getAsString(uploadResultJsonObject.get("type")));
    }
    if (uploadResultJsonObject.get("media_id") != null && !uploadResultJsonObject.get("media_id").isJsonNull()) {
      uploadResult.setMediaId(GsonHelper.getAsString(uploadResultJsonObject.get("media_id")));
    }
    if (uploadResultJsonObject.get("thumb_media_id") != null && !uploadResultJsonObject.get("thumb_media_id").isJsonNull()) {
      uploadResult.setThumbMediaId(GsonHelper.getAsString(uploadResultJsonObject.get("thumb_media_id")));
    }
    if (uploadResultJsonObject.get("created_at") != null && !uploadResultJsonObject.get("created_at").isJsonNull()) {
      uploadResult.setCreatedAt(GsonHelper.getAsPrimitiveLong(uploadResultJsonObject.get("created_at")));
    }
    return uploadResult;
  }
  
}
