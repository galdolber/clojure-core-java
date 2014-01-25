package clojure;

import clojure.lang.*;

public final class core_extend extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__2 = (java.lang.Object)2L;
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "protocol?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "implements?");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "var");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "-reset-methods");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "alter-var-root");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "assoc-in");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "impls");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_extend() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object atype1, java.lang.Object proto_PLUS_mmaps2) {
  {
   Object seq_60213 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, proto_PLUS_mmaps2));
   Object chunk_60224 = null;
   long count_60235 = 0L;
   long i_60246 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_60246, (long)count_60235)) {
     {
      Object vec__60257 = ((java.lang.Object)((clojure.lang.Indexed)chunk_60224).nth((int)RT.intCast(i_60246)));
      Object proto8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60257), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object mmap9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60257), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object __r3827 = ((IFn)const__7.getRawRoot()).invoke(proto8);
      if (__r3827 != null && !(__r3827 == Boolean.FALSE)) {
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(proto8, " is not a protocol"))));
      }
      Object __r3829 = ((IFn)const__9.getRawRoot()).invoke(proto8, atype1);
      if (__r3829 != null && !(__r3829 == Boolean.FALSE)) {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(atype1, " already directly implements ", RT.get(proto8, Keyword.intern(null, "on-interface")), " for protocol:", RT.get(proto8, Keyword.intern(null, "var"))))));
      } else {
      }
      ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(RT.get(proto8, Keyword.intern(null, "var")), const__14.getRawRoot(), RT.vector(const__15, atype1), mmap9));
      long i_60246___aux = clojure.lang.Numbers.unchecked_inc((long)i_60246);
      i_60246 = i_60246___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__10 = ((IFn)const__0.getRawRoot()).invoke(seq_60213);
      Object __r3831 = temp__4117__auto__10;
      if (__r3831 != null && !(__r3831 == Boolean.FALSE)) {
       {
        Object seq_602111 = temp__4117__auto__10;
        Object __r3833 = ((IFn)const__17.getRawRoot()).invoke(seq_602111);
        if (__r3833 != null && !(__r3833 == Boolean.FALSE)) {
         {
          Object c__4343__auto__12 = ((IFn)const__18.getRawRoot()).invoke(seq_602111);
          java.lang.Object seq_60213___aux = ((IFn)const__19.getRawRoot()).invoke(seq_602111);
          java.lang.Object chunk_60224___aux = c__4343__auto__12;
          long count_60235___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
          long i_60246___aux = clojure.lang.RT.intCast((long)0L);
          seq_60213 = seq_60213___aux;
          chunk_60224 = chunk_60224___aux;
          count_60235 = count_60235___aux;
          i_60246 = i_60246___aux;
          continue;
         }
        } else {
         {
          Object vec__602613 = ((IFn)const__22.getRawRoot()).invoke(seq_602111);
          Object proto14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__602613), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object mmap15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__602613), (int)RT.intCast(1L), ((java.lang.Object)null)));
          Object __r3835 = ((IFn)const__7.getRawRoot()).invoke(proto14);
          if (__r3835 != null && !(__r3835 == Boolean.FALSE)) {
          } else {
           Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(proto14, " is not a protocol"))));
          }
          Object __r3837 = ((IFn)const__9.getRawRoot()).invoke(proto14, atype1);
          if (__r3837 != null && !(__r3837 == Boolean.FALSE)) {
           Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(atype1, " already directly implements ", RT.get(proto14, Keyword.intern(null, "on-interface")), " for protocol:", RT.get(proto14, Keyword.intern(null, "var"))))));
          } else {
          }
          ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(RT.get(proto14, Keyword.intern(null, "var")), const__14.getRawRoot(), RT.vector(const__15, atype1), mmap15));
          java.lang.Object seq_60213___aux = ((IFn)const__23.getRawRoot()).invoke(seq_602111);
          java.lang.Object chunk_60224___aux = null;
          long count_60235___aux = 0L;
          long i_60246___aux = 0L;
          seq_60213 = seq_60213___aux;
          chunk_60224 = chunk_60224___aux;
          count_60235 = count_60235___aux;
          i_60246 = i_60246___aux;
          continue;
         }
        }
       }
      } else {
       return null;
      }
     }
    }
   }
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
