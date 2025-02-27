package org.amix.annotation

/*
 * Copyright 2025 Amix.
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

/** Marks experimental API in Amix. An experimental API can be changed or removed at any time. */
@RequiresOptIn(
  message = "This API is Experimental and is subject to drastic changes and even removal."
)
@Retention(AnnotationRetention.BINARY)
annotation class ExperimentalAmixApi

/** Marks robok api in Amix. RobokApis is created to be used in robok. */
@RequiresOptIn(
  level = RequiresOptIn.Level.WARNING,
  message =
    "This API is created to be used in Robok and is subject to change to conform to the software.",
)
@Retention(AnnotationRetention.BINARY)
annotation class RobokApi
