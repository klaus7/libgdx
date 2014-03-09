/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btHashedOverlappingPairCache extends btOverlappingPairCache {
	private long swigCPtr;
	
	protected btHashedOverlappingPairCache(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btHashedOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHashedOverlappingPairCache, normally you should not need this constructor it's intended for low-level usage. */
	public btHashedOverlappingPairCache(long cPtr, boolean cMemoryOwn) {
		this("btHashedOverlappingPairCache", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btHashedOverlappingPairCache_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btHashedOverlappingPairCache obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btHashedOverlappingPairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btHashedOverlappingPairCache() {
    this(CollisionJNI.new_btHashedOverlappingPairCache(), true);
  }

  public boolean needsBroadphaseCollision(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return CollisionJNI.btHashedOverlappingPairCache_needsBroadphaseCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public btBroadphasePair getOverlappingPairArrayPtr() {
	return btBroadphasePair.internalTemp(CollisionJNI.btHashedOverlappingPairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this), false);
}

  public btBroadphasePairArray getOverlappingPairArray() {
    return new btBroadphasePairArray(CollisionJNI.btHashedOverlappingPairCache_getOverlappingPairArray__SWIG_0(swigCPtr, this), false);
  }

  public int GetCount() {
    return CollisionJNI.btHashedOverlappingPairCache_GetCount(swigCPtr, this);
  }

  public btOverlapFilterCallback getOverlapFilterCallback() {
    long cPtr = CollisionJNI.btHashedOverlappingPairCache_getOverlapFilterCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlapFilterCallback(cPtr, false);
  }

}
