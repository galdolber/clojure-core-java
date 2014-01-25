package clojure;

import clojure.lang.*;

public final class core_ctor_sigs_iter__5517__5521_fn__5522 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
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
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object s__55181;
 Object iter__55170;
 public core_ctor_sigs_iter__5517__5521_fn__5522(final Object s__55181, final Object iter__55170) {
  super();
  this.s__55181 = s__55181;
  this.iter__55170 = iter__55170;
 }
 public java.lang.Object invoke() {
  {
   Object s__55181 = this.s__55181;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__55181);
     Object __r3517 = temp__4117__auto__2;
     if (__r3517 != null && !(__r3517 == Boolean.FALSE)) {
      {
       Object s__55183 = temp__4117__auto__2;
       Object __r3519 = ((IFn)const__1.getRawRoot()).invoke(s__55183);
       if (__r3519 != null && !(__r3519 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__55183);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__55206 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r3521 = ((IFn)new clojure.core_ctor_sigs_iter__5517__5521_fn__5522_fn__5523(size__4617__auto__5, b__55206, c__4616__auto__4)).invoke();
         if (__r3521 != null && !(__r3521 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__55206), ((IFn)this.iter__55170).invoke(((IFn)const__8.getRawRoot()).invoke(s__55183)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__55206), null);
         }
        }
       } else {
        {
         Object ctor7 = ((IFn)const__9.getRawRoot()).invoke(s__55183);
         Object __r3523 = ((IFn)const__10.getRawRoot()).invoke((java.lang.reflect.Modifier.isPrivate((int)((java.lang.reflect.Constructor)ctor7).getModifiers()) ? Boolean.TRUE : Boolean.FALSE));
         if (__r3523 != null && !(__r3523 == Boolean.FALSE)) {
          return ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13.getRawRoot(), ((java.lang.Class[])((java.lang.reflect.Constructor)ctor7).getParameterTypes())), ((IFn)this.iter__55170).invoke(((IFn)const__14.getRawRoot()).invoke(s__55183)));
         } else {
          java.lang.Object s__55181___aux = ((IFn)const__14.getRawRoot()).invoke(s__55183);
          s__55181 = s__55181___aux;
          continue;
         }
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
