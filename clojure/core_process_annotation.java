package clojure;

import clojure.lang.*;

public final class core_process_annotation extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
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
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "add-annotation");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_process_annotation() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object av1, java.lang.Object v2) {
  Object __r2997 = ((IFn)const__0.getRawRoot()).invoke(v2);
  if (__r2997 != null && !(__r2997 == Boolean.FALSE)) {
   {
    Object seq_48453 = ((IFn)const__1.getRawRoot()).invoke(v2);
    Object chunk_48464 = null;
    long count_48475 = 0L;
    long i_48486 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i_48486, (long)count_48475)) {
      {
       Object vec__48497 = ((java.lang.Object)((clojure.lang.Indexed)chunk_48464).nth((int)RT.intCast(i_48486)));
       Object k8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48497), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object v9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48497), (int)RT.intCast(1L), ((java.lang.Object)null)));
       ((IFn)const__6.getRawRoot()).invoke(av1, ((IFn)const__7.getRawRoot()).invoke(k8), v9);
       long i_48486___aux = clojure.lang.Numbers.unchecked_inc((long)i_48486);
       i_48486 = i_48486___aux;
       continue;
      }
     } else {
      {
       Object temp__4117__auto__10 = ((IFn)const__1.getRawRoot()).invoke(seq_48453);
       Object __r3000 = temp__4117__auto__10;
       if (__r3000 != null && !(__r3000 == Boolean.FALSE)) {
        {
         Object seq_484511 = temp__4117__auto__10;
         Object __r3002 = ((IFn)const__9.getRawRoot()).invoke(seq_484511);
         if (__r3002 != null && !(__r3002 == Boolean.FALSE)) {
          {
           Object c__4343__auto__12 = ((IFn)const__10.getRawRoot()).invoke(seq_484511);
           java.lang.Object seq_48453___aux = ((IFn)const__11.getRawRoot()).invoke(seq_484511);
           java.lang.Object chunk_48464___aux = c__4343__auto__12;
           long count_48475___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
           long i_48486___aux = clojure.lang.RT.intCast((long)0L);
           seq_48453 = seq_48453___aux;
           chunk_48464 = chunk_48464___aux;
           count_48475 = count_48475___aux;
           i_48486 = i_48486___aux;
           continue;
          }
         } else {
          {
           Object vec__485013 = ((IFn)const__14.getRawRoot()).invoke(seq_484511);
           Object k14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__485013), (int)RT.intCast(0L), ((java.lang.Object)null)));
           Object v15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__485013), (int)RT.intCast(1L), ((java.lang.Object)null)));
           ((IFn)const__6.getRawRoot()).invoke(av1, ((IFn)const__7.getRawRoot()).invoke(k14), v15);
           java.lang.Object seq_48453___aux = ((IFn)const__15.getRawRoot()).invoke(seq_484511);
           java.lang.Object chunk_48464___aux = null;
           long count_48475___aux = 0L;
           long i_48486___aux = 0L;
           seq_48453 = seq_48453___aux;
           chunk_48464 = chunk_48464___aux;
           count_48475 = count_48475___aux;
           i_48486 = i_48486___aux;
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
  } else {
   return ((IFn)const__6.getRawRoot()).invoke(av1, "value", v2);
  }
 }
}
