# ViewControlVisibility

**Download**

download is coming...

**How to use:**

```java
ViewControlVisibility myGroupOfViews = new ViewControlVisibility(mView1, mView2, mView3, ...);

myGroupOfViews.show(mView1, mView3); // Show only mView1 and mView3, or how many you need from your group
```

**Example Before:**
```java
@BindView(R.id.layoutContent) View layoutContent;
@BindView(R.id.layoutContentError) View layoutContentError;
@BindView(R.id.layoutLoader) View layoutLoader;

...

private void showLoader() {
  ...
  // YOU LOSE IN SO MANY GONE AND VISIBLE :(
  layoutContent.setVisibility(View.GONE);
  layoutContentError.setVisibility(View.GONE);
  layoutLoader.setVisibility(View.VISIBLE);
  ...
}

private void layoutContentErrorAndLoader() {
  ...
  // YOU LOSE IN SO MANY GONE AND VISIBLE :(
  layoutContent.setVisibility(View.GONE);
  layoutContentError.setVisibility(View.VISIBLE);
  layoutLoader.setVisibility(View.VISIBLE);
  ...
}
```

**Example Now:**
```java
@BindView(R.id.layoutContent) View layoutContent;
@BindView(R.id.layoutContentError) View layoutContentError;
@BindView(R.id.layoutLoader) View layoutLoader;
private ViewControlVisibility mLayoutControlVisibility;

@Override
public void onCreate(...) {
  mLayoutControlVisibility = new ViewControlVisibility(layoutContent, layoutContentError, layoutLoader);
}

...

private void showLoader() {
  ...
  mLayoutControlVisibility.show(layoutLoader); // SHOW ONLY WHAT YOU WANT :)
  ...
}

private void layoutContentErrorAndLoader() {
  ...
  mLayoutControlVisibility.show(layoutContent, layoutLoader);
  ...
}
```
# License

    Copyright 2017 Josinaldo A. Barbosa

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
