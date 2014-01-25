package clojure;

import clojure.lang.*;

public final class core_with_redefs_fn_root_bind__6550 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_with_redefs_fn_root_bind__6550() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   Object seq_65512 = ((IFn)const__0.getRawRoot()).invoke(m1);
   Object chunk_65523 = null;
   long count_65534 = 0L;
   long i_65545 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_65545, (long)count_65534)) {
     {
      Object vec__65556 = ((java.lang.Object)((clojure.lang.Indexed)chunk_65523).nth((int)RT.intCast(i_65545)));
      Object a_var7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__65556), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object a_val8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__65556), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((clojure.lang.Var)a_var7).bindRoot(((java.lang.Object)a_val8));
      long i_65545___aux = clojure.lang.Numbers.unchecked_inc((long)i_65545);
      i_65545 = i_65545___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__9 = ((IFn)const__0.getRawRoot()).invoke(seq_65512);
      Object __r4327 = temp__4117__auto__9;
      if (__r4327 != null && !(__r4327 == Boolean.FALSE)) {
       {
        Object seq_655110 = temp__4117__auto__9;
        Object __r4329 = ((IFn)const__6.getRawRoot()).invoke(seq_655110);
        if (__r4329 != null && !(__r4329 == Boolean.FALSE)) {
         {
          Object c__4343__auto__11 = ((IFn)const__7.getRawRoot()).invoke(seq_655110);
          java.lang.Object seq_65512___aux = ((IFn)const__8.getRawRoot()).invoke(seq_655110);
          java.lang.Object chunk_65523___aux = c__4343__auto__11;
          long count_65534___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__11)));
          long i_65545___aux = clojure.lang.RT.intCast((long)0L);
          seq_65512 = seq_65512___aux;
          chunk_65523 = chunk_65523___aux;
          count_65534 = count_65534___aux;
          i_65545 = i_65545___aux;
          continue;
         }
        } else {
         {
          Object vec__655612 = ((IFn)const__11.getRawRoot()).invoke(seq_655110);
          Object a_var13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__655612), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object a_val14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__655612), (int)RT.intCast(1L), ((java.lang.Object)null)));
          ((clojure.lang.Var)a_var13).bindRoot(((java.lang.Object)a_val14));
          java.lang.Object seq_65512___aux = ((IFn)const__12.getRawRoot()).invoke(seq_655110);
          java.lang.Object chunk_65523___aux = null;
          long count_65534___aux = 0L;
          long i_65545___aux = 0L;
          seq_65512 = seq_65512___aux;
          chunk_65523 = chunk_65523___aux;
          count_65534 = count_65534___aux;
          i_65545 = i_65545___aux;
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
