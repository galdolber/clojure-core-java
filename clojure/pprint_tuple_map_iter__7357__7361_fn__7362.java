package clojure;

import clojure.lang.*;

public final class pprint_tuple_map_iter__7357__7361_fn__7362 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__11 = (java.lang.Object)0L;
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object iter__73570;
 Object s__73581;
 Object v12;
 public pprint_tuple_map_iter__7357__7361_fn__7362(final Object iter__73570, final Object s__73581, final Object v12) {
  super();
  this.iter__73570 = iter__73570;
  this.s__73581 = s__73581;
  this.v12 = v12;
 }
 public java.lang.Object invoke() {
  {
   Object s__73581 = this.s__73581;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__73581);
     Object __r4817 = temp__4117__auto__2;
     if (__r4817 != null && !(__r4817 == Boolean.FALSE)) {
      {
       Object s__73583 = temp__4117__auto__2;
       Object __r4819 = ((IFn)const__1.getRawRoot()).invoke(s__73583);
       if (__r4819 != null && !(__r4819 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__73583);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__73606 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r4821 = ((IFn)new clojure.pprint_tuple_map_iter__7357__7361_fn__7362_fn__7363(c__4616__auto__4, b__73606, size__4617__auto__5, this.v12)).invoke();
         if (__r4821 != null && !(__r4821 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__73606), ((IFn)this.iter__73570).invoke(((IFn)const__8.getRawRoot()).invoke(s__73583)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__73606), null);
         }
        }
       } else {
        {
         Object vec__73667 = ((IFn)const__9.getRawRoot()).invoke(s__73583);
         Object k8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73667), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object v9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73667), (int)RT.intCast(1L), ((java.lang.Object)null)));
         return ((IFn)const__13.getRawRoot()).invoke(RT.vector(k8, RT.vector(v9, this.v12)), ((IFn)this.iter__73570).invoke(((IFn)const__14.getRawRoot()).invoke(s__73583)));
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
