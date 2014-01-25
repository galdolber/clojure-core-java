package clojure;

import clojure.lang.*;

public final class pprint_pretty_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "logical-block");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "buffer");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "pretty-writer");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "buffer-block");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "sections");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "buffer-level");
  const__9 = (java.lang.Object)1L;
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "trailing-white-space");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "column-writer");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "miser-width");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public pprint_pretty_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1, java.lang.Object max_columns2, java.lang.Object miser_width3) {
  {
   Object lb4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), null, null, ((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(Boolean.FALSE), ((IFn)const__2.getRawRoot()).invoke(Boolean.FALSE));
   Object fields5 = ((IFn)const__2.getRawRoot()).invoke(RT.mapUniqueKeys(const__4, clojure.lang.PersistentVector.EMPTY, const__5, Boolean.TRUE, const__6, lb4, const__7, null, const__8, const__9, const__10, null, const__11, const__3, const__12, ((IFn)const__13.getRawRoot()).invoke(writer1, max_columns2), const__14, lb4, const__15, const__16, const__17, miser_width3));
   {
    Object p__5329__auto__6 = new clojure.pprint.proxy$java.io.Writer$IDeref$PrettyFlush$8965b0c6();
    ((IFn)const__18.getRawRoot()).invoke(p__5329__auto__6, RT.mapUniqueKeys("close", new clojure.pprint_pretty_writer_fn__7560(), "flush", new clojure.pprint_pretty_writer_fn__7562(), "ppflush", new clojure.pprint_pretty_writer_fn__7564(), "write", new clojure.pprint_pretty_writer_fn__7568(), "deref", new clojure.pprint_pretty_writer_fn__7575(fields5)));
    return p__5329__auto__6;
   }
  }
 }
}
