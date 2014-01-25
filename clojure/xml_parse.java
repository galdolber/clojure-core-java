package clojure;

import clojure.lang.*;

public final class xml_parse extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.xml", "parse");
  const__1 = (clojure.lang.Var)RT.var("clojure.xml", "startparse-sax");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.xml", "*stack*");
  const__5 = (clojure.lang.Var)RT.var("clojure.xml", "*current*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__7 = (clojure.lang.Var)RT.var("clojure.xml", "element");
  const__8 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "between");
  const__10 = (clojure.lang.Var)RT.var("clojure.xml", "*sb*");
  const__11 = (clojure.lang.Var)RT.var("clojure.xml", "content-handler");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "content");
  const__13 = (java.lang.Object)0L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public xml_parse() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object startparse2) {
  {
   ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4, null, const__5, ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot()), const__8, const__9, const__10, null));
   try {
    ((IFn)startparse2).invoke(s1, const__11.getRawRoot());
    return ((IFn)RT.get(const__5.get(), Keyword.intern(null, "content"))).invoke(const__13);
   } finally {
    ((IFn)const__14.getRawRoot()).invoke();
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(s1, const__1.getRawRoot());
 }
}
