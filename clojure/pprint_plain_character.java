package clojure;

import clojure.lang.*;

public final class pprint_plain_character extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "print");
 }
 public pprint_plain_character() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77334 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object char5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77334), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77334), (int)RT.intCast(1L), ((java.lang.Object)null)));
   ((IFn)const__4.getRawRoot()).invoke(char5);
   return navigator6;
  }
 }
}
