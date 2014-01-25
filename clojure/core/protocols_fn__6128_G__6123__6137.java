package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6128_G__6123__6137 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.core.protocols.IKVReduce.class;
 }
 Object G__61242;
 public protocols_fn__6128_G__6123__6137(final Object G__61242) {
  super();
  this.G__61242 = G__61242;
 }
 public java.lang.Object invoke(java.lang.Object gf__amap__61341, java.lang.Object gf__f__61352, java.lang.Object gf__init__61363) {
  {
   Object cache__5922__auto__4 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__5 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__4).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__amap__61341))))));
   Object __r3887 = f__5923__auto__5;
   if (__r3887 != null && !(__r3887 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__5).invoke(gf__amap__61341, gf__f__61352, gf__init__61363);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__amap__61341, const__1, this.G__61242)).invoke(gf__amap__61341, gf__f__61352, gf__init__61363);
   }
  }
 }
}
