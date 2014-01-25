package clojure;

import clojure.lang.*;

public final class main_initialize extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "user");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*command-line-args*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.main", "init-dispatch");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public main_initialize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object args1, java.lang.Object inits2) {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  const__2.set(args1);
  {
   Object seq_68113 = ((IFn)const__3.getRawRoot()).invoke(inits2);
   Object chunk_68124 = null;
   long count_68135 = 0L;
   long i_68146 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_68146, (long)count_68135)) {
     {
      Object vec__68157 = ((java.lang.Object)((clojure.lang.Indexed)chunk_68124).nth((int)RT.intCast(i_68146)));
      Object opt8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68157), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object arg9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68157), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((IFn)((IFn)const__8.getRawRoot()).invoke(opt8)).invoke(arg9);
      long i_68146___aux = clojure.lang.Numbers.unchecked_inc((long)i_68146);
      i_68146 = i_68146___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__10 = ((IFn)const__3.getRawRoot()).invoke(seq_68113);
      Object __r4476 = temp__4117__auto__10;
      if (__r4476 != null && !(__r4476 == Boolean.FALSE)) {
       {
        Object seq_681111 = temp__4117__auto__10;
        Object __r4478 = ((IFn)const__10.getRawRoot()).invoke(seq_681111);
        if (__r4478 != null && !(__r4478 == Boolean.FALSE)) {
         {
          Object c__4343__auto__12 = ((IFn)const__11.getRawRoot()).invoke(seq_681111);
          java.lang.Object seq_68113___aux = ((IFn)const__12.getRawRoot()).invoke(seq_681111);
          java.lang.Object chunk_68124___aux = c__4343__auto__12;
          long count_68135___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
          long i_68146___aux = clojure.lang.RT.intCast((long)0L);
          seq_68113 = seq_68113___aux;
          chunk_68124 = chunk_68124___aux;
          count_68135 = count_68135___aux;
          i_68146 = i_68146___aux;
          continue;
         }
        } else {
         {
          Object vec__681613 = ((IFn)const__15.getRawRoot()).invoke(seq_681111);
          Object opt14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__681613), (int)RT.intCast(0L), ((java.lang.Object)null)));
          Object arg15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__681613), (int)RT.intCast(1L), ((java.lang.Object)null)));
          ((IFn)((IFn)const__8.getRawRoot()).invoke(opt14)).invoke(arg15);
          java.lang.Object seq_68113___aux = ((IFn)const__16.getRawRoot()).invoke(seq_681111);
          java.lang.Object chunk_68124___aux = null;
          long count_68135___aux = 0L;
          long i_68146___aux = 0L;
          seq_68113 = seq_68113___aux;
          chunk_68124 = chunk_68124___aux;
          count_68135 = count_68135___aux;
          i_68146 = i_68146___aux;
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
