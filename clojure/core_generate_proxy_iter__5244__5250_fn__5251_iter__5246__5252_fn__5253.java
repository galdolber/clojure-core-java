package clojure;

import clojure.lang.*;

public final class core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252_fn__5253 extends clojure.lang.AFunction {
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
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object iter__52460;
 Object considered50;
 Object s__52471;
 public core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252_fn__5253(final Object iter__52460, final Object considered50, final Object s__52471) {
  super();
  this.iter__52460 = iter__52460;
  this.considered50 = considered50;
  this.s__52471 = s__52471;
 }
 public java.lang.Object invoke() {
  {
   Object s__52471 = this.s__52471;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__52471);
     Object __r3345 = temp__4117__auto__2;
     if (__r3345 != null && !(__r3345 == Boolean.FALSE)) {
      {
       Object s__52473 = temp__4117__auto__2;
       Object __r3347 = ((IFn)const__1.getRawRoot()).invoke(s__52473);
       if (__r3347 != null && !(__r3347 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__52473);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__52496 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r3349 = ((IFn)new clojure.core_generate_proxy_iter__5244__5250_fn__5251_iter__5246__5252_fn__5253_fn__5254(this.considered50, c__4616__auto__4, b__52496, size__4617__auto__5)).invoke();
         if (__r3349 != null && !(__r3349 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__52496), ((IFn)this.iter__52460).invoke(((IFn)const__8.getRawRoot()).invoke(s__52473)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__52496), null);
         }
        }
       } else {
        {
         Object meth7 = ((IFn)const__9.getRawRoot()).invoke(s__52473);
         {
          Object msig8 = ((IFn)const__10.getRawRoot()).invoke(meth7);
          Object __r3351 = ((IFn)const__11.getRawRoot()).invoke(((IFn)this.considered50).invoke(msig8));
          if (__r3351 != null && !(__r3351 == Boolean.FALSE)) {
           return ((IFn)const__12.getRawRoot()).invoke(RT.mapUniqueKeys(msig8, meth7), ((IFn)this.iter__52460).invoke(((IFn)const__13.getRawRoot()).invoke(s__52473)));
          } else {
           java.lang.Object s__52471___aux = ((IFn)const__13.getRawRoot()).invoke(s__52473);
           s__52471 = s__52471___aux;
           continue;
          }
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
