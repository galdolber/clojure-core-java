package clojure;

import clojure.lang.*;

public final class pprint_column_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "column-writer");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "*default-page-width*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "max");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "cur");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public pprint_column_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1, java.lang.Object max_columns2) {
  {
   Object fields3 = ((IFn)const__2.getRawRoot()).invoke(RT.mapUniqueKeys(const__3, max_columns2, const__4, const__5, const__6, const__5, const__7, writer1));
   {
    Object p__5329__auto__4 = new clojure.pprint.proxy$java.io.Writer$IDeref$db53459f();
    ((IFn)const__8.getRawRoot()).invoke(p__5329__auto__4, RT.mapUniqueKeys("write", new clojure.pprint_column_writer_fn__7401(), "flush", new clojure.pprint_column_writer_fn__7410(writer1), "deref", new clojure.pprint_column_writer_fn__7412(fields3)));
    return p__5329__auto__4;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object writer1) {
  return ((IFn)const__0.getRawRoot()).invoke(writer1, const__1.get());
 }
}
