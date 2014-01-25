package clojure;

import clojure.lang.*;

public final class xml_fn__6926_fn__6939 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "chars");
  const__3 = (clojure.lang.Var)RT.var("clojure.xml", "*sb*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
 }
 public xml_fn__6926_fn__6939() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object ch2, java.lang.Object start3, java.lang.Object length4) {
  if (clojure.lang.Util.equiv(((java.lang.Object)const__1.get()), ((java.lang.Object)const__2))) {
  } else {
   const__3.set(new java.lang.StringBuilder());
  }
  {
   Object sb5 = const__3.get();
   ((java.lang.StringBuilder)sb5).append((char[])((char[])ch2), (int)clojure.lang.RT.intCast(((java.lang.Object)start3)), (int)clojure.lang.RT.intCast(((java.lang.Object)length4)));
   const__1.set(const__2);
  }
  return null;
 }
}
