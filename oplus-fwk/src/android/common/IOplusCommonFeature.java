package android.common;

import android.common.OplusFeatureList;

/* loaded from: classes.dex */
public interface IOplusCommonFeature {
    default OplusFeatureList.OplusIndex index() {
        return OplusFeatureList.OplusIndex.End;
    }

    default IOplusCommonFeature getDefault() {
        return null;
    }
}
