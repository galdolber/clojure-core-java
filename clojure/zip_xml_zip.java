package clojure;

import clojure.lang.*;

public final class zip_xml_zip extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "zipper");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "complement");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "comp");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "content");
 }
 public zip_xml_zip() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object root1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot()), ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), const__5), new clojure.zip_xml_zip_fn__6987(), root1);
 }
}
