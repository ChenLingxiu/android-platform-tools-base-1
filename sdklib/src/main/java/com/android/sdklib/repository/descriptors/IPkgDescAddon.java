/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.sdklib.repository.descriptors;

import com.android.annotations.NonNull;

/**
 * {@link IPkgDescAddon} keeps information on individual add-on SDK packages
 * (both local or remote packages definitions.) The base {@link IPkgDesc} tries
 * to present a unified interface to package attributes and this interface
 * adds methods specific to extras.
 * <p/>
 * To create a new {@link IPkgDescAddon},
 * use {@link PkgDesc.Builder#newAddon(com.android.sdklib.AndroidVersion, com.android.sdklib.repository.MajorRevision, IdDisplay, IdDisplay)}.
 * <p/>
 * To query generic packages capabilities, rely on {@link #getType()} and the
 * {@code IPkgDesc.hasXxx()} methods provided by {@link IPkgDesc}.
 */
public interface IPkgDescAddon extends IPkgDesc {

    /**
     * Returns the id/display name of the add-on.
     * @return A non-null id/display name for the add-on
     */
    @NonNull public IdDisplay getName();
}
