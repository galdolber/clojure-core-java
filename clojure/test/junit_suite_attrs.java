package clojure.test;

import clojure.lang.*;

public final class junit_suite_attrs extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "package");
 }
 public junit_suite_attrs() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object package1, java.lang.Object classname2) {
  {
   Object attrs3 = RT.mapUniqueKeys(const__0, classname2);
   Object __r4780 = package1;
   if (__r4780 != null && !(__r4780 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(attrs3, const__2, package1);
   } else {
    return attrs3;
   }
  }
 }
}
