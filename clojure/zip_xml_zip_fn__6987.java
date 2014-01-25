package clojure;

import clojure.lang.*;

public final class zip_xml_zip_fn__6987 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "content");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 public zip_xml_zip_fn__6987() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object node1, java.lang.Object children2) {
  Object __r4545 = null;
  {
   Object and__3966__auto__3 = children2;
   Object __r4546;
   Object __r4547 = and__3966__auto__3;
   if (__r4547 != null && !(__r4547 == Boolean.FALSE)) {
    __r4546 = ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), children2);
   } else {
    __r4546 = and__3966__auto__3;
   }
   __r4545 = __r4546;
  }
  return ((IFn)const__0.getRawRoot()).invoke(node1, const__1, __r4545);
 }
}
