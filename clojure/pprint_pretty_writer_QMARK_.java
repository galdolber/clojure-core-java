package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IDeref.class;
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "pretty-writer");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public pprint_pretty_writer_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   boolean and__3966__auto__2 = (x1 instanceof clojure.lang.IDeref);
   if (and__3966__auto__2) {
    return RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(x1)), Keyword.intern(null, "pretty-writer"));
   } else {
    return (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
