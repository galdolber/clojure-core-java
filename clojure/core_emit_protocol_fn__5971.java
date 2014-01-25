package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5971 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.IPersistentSet const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__7 = (clojure.lang.IPersistentSet)PersistentHashSet.create(0L);
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
 }
 Object name1;
 public core_emit_protocol_fn__5971(final Object name1) {
  super();
  this.name1 = name1;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object s2) {
  {
   Object name_meta3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(s2));
   Object mname4 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(s2), null);
   Object vec__59725 = ((IFn)new clojure.core_emit_protocol_fn__5971_fn__5973(s2)).invoke();
   Object arglists6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59725), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object doc7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59725), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r3810 = ((IFn)const__6.getRawRoot()).invoke(const__7, ((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), arglists6));
   if (__r3810 != null && !(__r3810 == Boolean.FALSE)) {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__10.getRawRoot()).invoke("Definition of function ", mname4, " in protocol ", this.name1, " must take at least one arg."))));
   } else {
   }
   Object __r3812 = ((IFn)m1).invoke(((IFn)const__11.getRawRoot()).invoke(mname4));
   if (__r3812 != null && !(__r3812 == Boolean.FALSE)) {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__10.getRawRoot()).invoke("Function ", mname4, " in protocol ", this.name1, " was redefined. Specify all arities in single definition."))));
   } else {
   }
   return ((IFn)const__12.getRawRoot()).invoke(m1, ((IFn)const__11.getRawRoot()).invoke(mname4), ((IFn)const__13.getRawRoot()).invoke(name_meta3, RT.mapUniqueKeys(const__14, ((IFn)const__15.getRawRoot()).invoke(mname4, const__12.getRawRoot(), const__16, doc7, const__17, arglists6), const__17, arglists6, const__16, doc7)));
  }
 }
}
