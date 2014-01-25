package clojure;

import clojure.lang.*;

public final class core__reset_methods extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "method-builders");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core__reset_methods() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1) {
  {
   Object seq_59362 = ((IFn)const__0.getRawRoot()).invoke(RT.get(protocol1, Keyword.intern(null, "method-builders")));
   Object chunk_59373 = null;
   long count_59384 = 0L;
   long i_59395 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_59395, (long)count_59384)) {
     {
      Object vec__59406 = ((java.lang.Object)((clojure.lang.Indexed)chunk_59373).nth((int)RT.intCast(i_59395)));
      Object v7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59406), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object build8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59406), (int)RT.intCast(1L), ((java.lang.Object)null)));
      {
       Object cache9 = new clojure.lang.MethodImplCache((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)protocol1), (clojure.lang.Keyword)((clojure.lang.Keyword)((IFn)const__6.getRawRoot()).invoke(((clojure.lang.Symbol)((clojure.lang.Var)v7).sym))));
       ((clojure.lang.Var)v7).bindRoot(((java.lang.Object)((IFn)build8).invoke(cache9)));
      }
      long i_59395___aux = clojure.lang.Numbers.unchecked_inc((long)i_59395);
      i_59395 = i_59395___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__10 = ((IFn)const__0.getRawRoot()).invoke(seq_59362);
      Object __r3775 = temp__4117__auto__10;
      if (__r3775 != null && !(__r3775 == Boolean.FALSE)) {
       {
        Object seq_593611 = temp__4117__auto__10;
        Object __r3777 = ((IFn)const__8.getRawRoot()).invoke(seq_593611);
        if (__r3777 != null && !(__r3777 == Boolean.FALSE)) {
         {
          Object c__4343__auto__12 = ((IFn)const__9.getRawRoot()).invoke(seq_593611);
          java.lang.Object seq_59362___aux = ((IFn)const__10.getRawRoot()).invoke(seq_593611);
          java.lang.Object chunk_59373___aux = c__4343__auto__12;
          long count_59384___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
          long i_59395___aux = clojure.lang.RT.intCast((long)0L);
          seq_59362 = seq_59362___aux;
          chunk_59373 = chunk_59373___aux;
          count_59384 = count_59384___aux;
          i_59395 = i_59395___aux;
          continue;
         }
        } else {
         {
          Object vec__594113 = ((IFn)const__13.getRawRoot()).invoke(seq_593611);
          Object v14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__594113), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object build15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__594113), (int)RT.intCast(1L), ((java.lang.Object)null)));
          {
           Object cache16 = new clojure.lang.MethodImplCache((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)protocol1), (clojure.lang.Keyword)((clojure.lang.Keyword)((IFn)const__6.getRawRoot()).invoke(((clojure.lang.Symbol)((clojure.lang.Var)v14).sym))));
           ((clojure.lang.Var)v14).bindRoot(((java.lang.Object)((IFn)build15).invoke(cache16)));
          }
          java.lang.Object seq_59362___aux = ((IFn)const__14.getRawRoot()).invoke(seq_593611);
          java.lang.Object chunk_59373___aux = null;
          long count_59384___aux = 0L;
          long i_59395___aux = 0L;
          seq_59362 = seq_59362___aux;
          chunk_59373 = chunk_59373___aux;
          count_59384 = count_59384___aux;
          i_59395 = i_59395___aux;
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
}
